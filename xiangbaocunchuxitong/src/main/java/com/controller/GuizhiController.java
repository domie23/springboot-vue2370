
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 柜子信息
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/guizhi")
public class GuizhiController {
    private static final Logger logger = LoggerFactory.getLogger(GuizhiController.class);

    private static final String TABLE_NAME = "guizhi";

    @Autowired
    private GuizhiService guizhiService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private ForumService forumService;//论坛
    @Autowired
    private GuizhiYuyueService guizhiYuyueService;//物品存储
    @Autowired
    private NewsService newsService;//公告信息
    @Autowired
    private YonghuService yonghuService;//用户
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        params.put("guizhiDeleteStart",1);params.put("guizhiDeleteEnd",1);
        CommonUtil.checkMap(params);
        PageUtils page = guizhiService.queryPage(params);

        //字典表数据转换
        List<GuizhiView> list =(List<GuizhiView>)page.getList();
        for(GuizhiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        GuizhiEntity guizhi = guizhiService.selectById(id);
        if(guizhi !=null){
            //entity转view
            GuizhiView view = new GuizhiView();
            BeanUtils.copyProperties( guizhi , view );//把实体数据重构到view中
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody GuizhiEntity guizhi, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,guizhi:{}",this.getClass().getName(),guizhi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<GuizhiEntity> queryWrapper = new EntityWrapper<GuizhiEntity>()
            .eq("guizhi_name", guizhi.getGuizhiName())
            .eq("guizhi_types", guizhi.getGuizhiTypes())
            .eq("guizhi_address", guizhi.getGuizhiAddress())
            .eq("status_types", guizhi.getStatusTypes())
            .eq("guizhi_delete", guizhi.getGuizhiDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        GuizhiEntity guizhiEntity = guizhiService.selectOne(queryWrapper);
        if(guizhiEntity==null){
            guizhi.setGuizhiDelete(1);
            guizhi.setInsertTime(new Date());
            guizhi.setCreateTime(new Date());
            guizhiService.insert(guizhi);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody GuizhiEntity guizhi, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,guizhi:{}",this.getClass().getName(),guizhi.toString());
        GuizhiEntity oldGuizhiEntity = guizhiService.selectById(guizhi.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        if("".equals(guizhi.getGuizhiPhoto()) || "null".equals(guizhi.getGuizhiPhoto())){
                guizhi.setGuizhiPhoto(null);
        }

            guizhiService.updateById(guizhi);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<GuizhiEntity> oldGuizhiList =guizhiService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        ArrayList<GuizhiEntity> list = new ArrayList<>();
        for(Integer id:ids){
            GuizhiEntity guizhiEntity = new GuizhiEntity();
            guizhiEntity.setId(id);
            guizhiEntity.setGuizhiDelete(2);
            list.add(guizhiEntity);
        }
        if(list != null && list.size() >0){
            guizhiService.updateBatchById(list);
        }

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<GuizhiEntity> guizhiList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            GuizhiEntity guizhiEntity = new GuizhiEntity();
//                            guizhiEntity.setGuizhiUuidNumber(data.get(0));                    //柜子编号 要改的
//                            guizhiEntity.setGuizhiName(data.get(0));                    //柜子名称 要改的
//                            guizhiEntity.setGuizhiPhoto("");//详情和图片
//                            guizhiEntity.setGuizhiTypes(Integer.valueOf(data.get(0)));   //柜子类型 要改的
//                            guizhiEntity.setGuizhiAddress(data.get(0));                    //柜子地址 要改的
//                            guizhiEntity.setGuizhiNewMoney(data.get(0));                    //价格 要改的
//                            guizhiEntity.setStatusTypes(Integer.valueOf(data.get(0)));   //柜子状态 要改的
//                            guizhiEntity.setGuizhiContent("");//详情和图片
//                            guizhiEntity.setGuizhiDelete(1);//逻辑删除字段
//                            guizhiEntity.setInsertTime(date);//时间
//                            guizhiEntity.setCreateTime(date);//时间
                            guizhiList.add(guizhiEntity);


                            //把要查询是否重复的字段放入map中
                                //柜子编号
                                if(seachFields.containsKey("guizhiUuidNumber")){
                                    List<String> guizhiUuidNumber = seachFields.get("guizhiUuidNumber");
                                    guizhiUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> guizhiUuidNumber = new ArrayList<>();
                                    guizhiUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("guizhiUuidNumber",guizhiUuidNumber);
                                }
                        }

                        //查询是否重复
                         //柜子编号
                        List<GuizhiEntity> guizhiEntities_guizhiUuidNumber = guizhiService.selectList(new EntityWrapper<GuizhiEntity>().in("guizhi_uuid_number", seachFields.get("guizhiUuidNumber")).eq("guizhi_delete", 1));
                        if(guizhiEntities_guizhiUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(GuizhiEntity s:guizhiEntities_guizhiUuidNumber){
                                repeatFields.add(s.getGuizhiUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [柜子编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        guizhiService.insertBatch(guizhiList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = guizhiService.queryPage(params);

        //字典表数据转换
        List<GuizhiView> list =(List<GuizhiView>)page.getList();
        for(GuizhiView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        GuizhiEntity guizhi = guizhiService.selectById(id);
            if(guizhi !=null){


                //entity转view
                GuizhiView view = new GuizhiView();
                BeanUtils.copyProperties( guizhi , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody GuizhiEntity guizhi, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,guizhi:{}",this.getClass().getName(),guizhi.toString());
        Wrapper<GuizhiEntity> queryWrapper = new EntityWrapper<GuizhiEntity>()
            .eq("guizhi_uuid_number", guizhi.getGuizhiUuidNumber())
            .eq("guizhi_name", guizhi.getGuizhiName())
            .eq("guizhi_types", guizhi.getGuizhiTypes())
            .eq("guizhi_address", guizhi.getGuizhiAddress())
            .eq("status_types", guizhi.getStatusTypes())
            .eq("guizhi_delete", guizhi.getGuizhiDelete())
//            .notIn("guizhi_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        GuizhiEntity guizhiEntity = guizhiService.selectOne(queryWrapper);
        if(guizhiEntity==null){
            guizhi.setGuizhiDelete(1);
            guizhi.setInsertTime(new Date());
            guizhi.setCreateTime(new Date());
        guizhiService.insert(guizhi);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}


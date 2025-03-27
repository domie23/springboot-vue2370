const base = {
    get() {
        return {
            url : "http://localhost:8080/xiangbaocunchuxitong/",
            name: "xiangbaocunchuxitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xiangbaocunchuxitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "箱包存储系统"
        } 
    }
}
export default base

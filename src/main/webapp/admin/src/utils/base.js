const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm50kf2/",
            name: "ssm50kf2",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm50kf2/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "南阳特产销售平台"
        } 
    }
}
export default base

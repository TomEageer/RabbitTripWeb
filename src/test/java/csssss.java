//@WebServlet("/route/*")
//public class RouteServlet extends BaseServlet {
//
//    private RouteService routeService = new RouteServiceImpl();
//
//    /**
//     * 分页查询
//     * @param request
//     * @param response
//     * @throws ServletException
//     * @throws IOException
//     */
//    public void pageQuery(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        //1.接受参数
//        String currentPageStr = request.getParameter("currentPage");/*从ajax里面获取当前页码*/
//        String pageSizeStr = request.getParameter("pageSize");/*获取页码大小*/
//        String cidStr = request.getParameter("cid");
//
//        int cid = 0;//类别id
//        //2.处理参数
//        if(cidStr != null && cidStr.length() > 0){
//            cid = Integer.parseInt(cidStr);
//        }
//
//        /*处理当前页*/
//        int currentPage = 0;//当前页码，如果不传递，则默认为第一页
//        if(currentPageStr != null && currentPageStr.length() > 0){
//            currentPage = Integer.parseInt(currentPageStr);
//        }else{
//            currentPage = 1;
//        }
//
//        /*这里不用传递，直接每页显示3条记录处理每页显示的条数*/
//        int pageSize = 0;//每页显示条数，如果不传递，默认每页显示5条记录
//        if(pageSizeStr != null && pageSizeStr.length() > 0){
//            pageSize = Integer.parseInt(pageSizeStr);
//        }else{
//            pageSize = 5;
//        }
//
//        //3. 调用service查询PageBean对象
//        PageBean<Route> pb = routeService.pageQuery(cid, currentPage, pageSize);
//
//        //4. 将pageBean对象序列化为json，返回
//        writeValue(pb,response);
//
//    }
//
//}
package November;

public class D06_2 {
    public static void main(String[] args) {
        String url = "https://www.gihoo.or.kr/netzero/user/board/pressRelease/nv_carbonNtrlWordView.do?firstIndex=&currentPageNo=1&recordCountPerPage=10&bbscttId=게시글이동경로&bbsId=CRBNNTRLWORD&p_cntntsNm=";

        String url1 = url.replace("게시글이동경로","BBSCTT_0000000923");
        System.out.println(url1);

    }
}

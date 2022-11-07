package November;

public class D06 {
    public static void main(String[] args) {

        String prom = "<div class=\"title__tit\"> <a href=\"javascript:void(0);\" class=\"link-cell ellipsis-txt tooltip-target\" onclick=\"bbscttView( 'BBSCTT_0000000931')\"> <!-- 스티커 있는 경우 --> \n" +
                "  <div class=\"sticker-box\"> \n" +
                "   <div class=\"sub-txt\">\n" +
                "    해양수산부\n" +
                "   </div> <!-- 모바일용 라벨 --> \n" +
                "  </div> \n" +
                "  <div class=\"txt-box\"> \n" +
                "   <div class=\"sub-txt\">\n" +
                "     해양수산부 \n" +
                "   </div> \n" +
                "   <div class=\"main-txt\">\n" +
                "     세계 각국의 전문가들과 함께 블루카본을 논하다 \n" +
                "   </div> \n" +
                "  </div> </a> \n" +
                "</div> \n" +
                "<div class=\"title__etc\"> \n" +
                " <p>2022-08-23</p> \n" +
                " <p>218</p> <i class=\"ico ico--addfile\"></i> \n" +
                "</div>";
        int a = prom.indexOf("BBSCTT");
        System.out.println(a);

        String answer = prom.substring(a,a+17);
        System.out.println(answer);

    }
}

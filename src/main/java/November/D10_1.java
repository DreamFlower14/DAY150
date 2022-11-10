package November;

public class D10_1 {
    public static void main(String[] args) {
        String contents = "<p><img alt="" src="https://czero-bucket.s3.ap-northeast-2.amazonaws.com/static/2022-11-10T09%3A59%3A49.881.jpg" style="height:577px; width:1110px" /></p>"

        String test1 = contents.split("<img alt=\"\" src=\"")[1];
        String test2 = test1.split("\"")[0];

        String imgThum =
                contents.substring(contents.indexOf(test1),
                        test2.length());
    }
}

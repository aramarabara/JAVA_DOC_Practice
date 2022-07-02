/**/

const normalKoreanString = "안녕";

const muFunction = {

    myInnerFunction() {
        //한글을 보존하기 위하여 URI인코딩
        let encodedString = encodeURIComponent(normalKoreanString);
        //다시 Base64로 인코딩하여 xss등의 필터처리를 피한다.
        encodedString = btoa(encodedString);

        //이후 요청을 보내 Java 혹은 다른 서버단에서
        // base64 decoding / URLDecoding을 해주면 변환손실없이 정상작동 가능
    }

}
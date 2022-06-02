public class Hello {

    /**
     * Animal.jar와 Machine.jar를 추가하여 빌드 성공
     * 이 두 가지를 동적으로 로드할 수 있으면 java의 Dynamic classLoading에 대해 이해할 수 있다.
     * @param args
     */
    public static void main(String[] args) {



        System.out.println("I am a classLoader!! I load Classes..");

        /**
         *  classLoader : 클래스를 로드한다.
         */
        ClassLoader loader = new ClassLoader() {

        };


    }

}

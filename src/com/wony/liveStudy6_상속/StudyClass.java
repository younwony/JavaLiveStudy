package com.wony.liveStudy6_상속;

public class StudyClass {

    public static void main(String[] args) {

        parentClass parentClass = new parentClass();
        parentClass childClass = new childClass();
        childClass childClass1 = new childClass();

        /**
         * 부모 객체에 자식 인스턴스 생성 가능 하지만, 자식 객체에 부모 인스턴스는 불가능
         * Down Casting 확인
         *
         * 객체의 인스턴스 생성에는 클래스에 해당하는 정보를 채워줘야 한다.
         * ex) childClass childClass2 = new parentClass;
         * 이에 따라 childClass 가 필요로하는 정보를 parentClass가 채워줘야 하는데 parentClass는 childClass가 필요로 하는 정보를 가지고 있지 않기에 채워 넣을 수 없다.
         *
         * 캐스팅을 하게 죄면 Compile Error 는 나지 않지만 RunTime Error가 발생한다.
         * Compile은 캐스팅을 했기때문에 데이터를 주입할 수 있구나~ 라고 생각해 Error를 발생하지 않지만
         * Runtime은 실제 JVM이 런타임 과정에서 필요로하는 데이터를 찾지 못하기 때문에 Casting Error를 발생시킨다.
         */
       // childClass childClass2 = (childClass) new parentClass(); //부모 객체에 자식 인스턴스 생성 가능 하지만, 자식 객체에 부모 인스턴스는 불가능

        System.out.println(parentClass.getClass());
        System.out.println(childClass.getClass());
        System.out.println(childClass1.getClass());


        System.out.println(parentClass.getClass());
        System.out.println(childClass.getClass());
        System.out.println(childClass1.getClass());

        parentClass.said();
        childClass.said();
        childClass1.said();

        childClass.parent();
    }


    static class parentClass{

        String name = "Mom";

        void said(){
            System.out.println("HI, " + this.getClass().getSimpleName());
        }

        private void parent(){
            System.out.println("parent");
        }


    }

    static class childClass extends parentClass{

        @Override
        void said() {
            System.out.println("NO, HI");
        }

        private void child(){
            super.said();
            System.out.println(super.name);
            System.out.println("child");
        }
    }



}


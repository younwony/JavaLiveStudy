package com.wony.liveStudy9_에외처리;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

class ExceptionTest {

    @Test
    void Exception(){

        try {
            // 입력 코드
        }catch (Exception exception){
            // Exception 처리 코드
        }
    }

    @Test
    void mulityException(){
        try {
            // 입력 코드
        }catch (ArithmeticException | IllegalArgumentException | IndexOutOfBoundsException exception ){
            // ArithmeticException, IllegalArgumentException, IndexOutOfBoundsException 처리 코드
        }
    }

    @Test
    void finallyException(){
        try {
            // 입력 코드
        }catch (Exception e){
            // Exception 처리 코드
        }finally {
            // 반드시 실행되는 코드 영역
        }
    }

    @Test
    void compareFinallyResourceException(){
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    void resourceException(){
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void throwException(){
        try {
            int a = 4/0;
        }catch (Exception e){
            try {
                throw new Exception("int a = 4/0");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
    @Test
    void throwsException() throws IllegalArgumentException, FileNotFoundException, ArithmeticException {
        try {
            int a = 4/0;
        }catch (Exception e){
            throw new ArithmeticException("int a = 4/0");
        }
    }

}
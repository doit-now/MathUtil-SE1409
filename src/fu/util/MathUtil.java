/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.util;

/**
 *
 * @author giao-lang
 */
//?ây là class ch?a các hàm ti?n ích xài chung cho các n?i khác
//nó ch?a các hàm tính toán b? tr? cho các class khác
//do là ?? b? tr?, xài chung, nên chúng là STATIC
public class MathUtil {
    
    //hàm tính n! = 1.2.3...n, vì t?ng k?t qu? r?t nhanh, s?m tràn
    //int ch? t?i ?a 2 t? 1, ph?i ?? long cho ?? b? tràn k?t qu?
    //mình ch? nên tính n <= 15, vì 20! to l?m
    public static long computeFactorial(int n) {
        
        if(n < 0 || n > 15)
            throw new IllegalArgumentException("Invalid argument. n mus be >= 0 and <= 15");
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }        
        return result;
    }
}

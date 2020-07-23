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
//?�y l� class ch?a c�c h�m ti?n �ch x�i chung cho c�c n?i kh�c
//n� ch?a c�c h�m t�nh to�n b? tr? cho c�c class kh�c
//do l� ?? b? tr?, x�i chung, n�n ch�ng l� STATIC
public class MathUtil {
    
    //h�m t�nh n! = 1.2.3...n, v� t?ng k?t qu? r?t nhanh, s?m tr�n
    //int ch? t?i ?a 2 t? 1, ph?i ?? long cho ?? b? tr�n k?t qu?
    //m�nh ch? n�n t�nh n <= 15, v� 20! to l?m
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

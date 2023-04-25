/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg6;

/**
 *
 * @author natsu
 */

public class Lab6Q6 {
    public static boolean isPalindromicPrime(int n) {
    // Check if n is prime
    if (!isPrime(n)) {
        return false;
    }

    // Check if n is a palindrome
    String str = Integer.toString(n);
    for (int i = 0; i < str.length() / 2; i++) {
        if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
            return false;
        }
    }

    return true;
}

public static boolean isEmirp(int n) {
    // Check if n is prime
    if (!isPrime(n)) {
        return false;
    }

    // Check if n is an emirp
    int reverse = Integer.parseInt(new StringBuilder(Integer.toString(n)).reverse().toString());
    return isPrime(reverse) && !isPalindromicPrime(reverse);
}
public static boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }

    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }

    return true;
}
    public static void main(String[] args) {
       int count = 0;
for (int i = 2; count < 20; i++) {
    if (isPalindromicPrime(i)) {
        System.out.println(i + " is a palindromic prime");
        count++;
    }
}

count = 0;
for (int i = 2; count < 20; i++) {
    if (isEmirp(i)) {
        System.out.println(i + " is an emirp");
        count++;
    }
}
}
    }


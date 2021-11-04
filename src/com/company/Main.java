package com.company;

public class Main {

    public static void main(String[] args) {
	char ch;
	ch='L';
	System.out.println("\u001B[32mCh равно "+ ch);
	ch++;
        System.out.println("Ch равно "+ ch);
        ch = 'В';
        System.out.println("\u001B[31mCh равно "+ ch);
        ch--;
        System.out.println("Ch равно "+ ch);
    }
}

package com.company.basic;

public class HarmonicSum { // Сохранить как "HarmonicSum.java"
    public static void main(String[] args) {
// Определение переменных
        int maxDenominator = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;
        for (int denominator = 1; denominator <= maxDenominator; denominator++) {
            sumL2R += (double) (1 / denominator);
        }

        System.out.println("Сумма слева направо:" + sumL2R);

        for (int denominator = 50000; denominator >= 1; denominator--) {
            sumR2L += (double) (1 / denominator);
        }

        System.out.println("Сумма cправa налево :" + sumR2L);

        if (sumL2R > sumR2L) {
            System.out.println("false");
        }
    }
}
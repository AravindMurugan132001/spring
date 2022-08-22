package com.nseit.spring;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class QuickSort implements SortAlg {
    @Qualifier
    @Override
    public int[] sort(int[] numbers){
        return numbers;
    }
}

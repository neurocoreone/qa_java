package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline cat = new Feline();
        List<String> responseList = cat.eatMeat();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), responseList);
    }

    @Test
    public void getFamilyTest() {
        Feline cat = new Feline();
        String responseFamily = cat.getFamily();
        Assert.assertEquals("Кошачьи", responseFamily);
    }

    @Test
    public void getKittensTest() {
        Feline cat = new Feline();
        int kittensCount = cat.getKittens();
        Assert.assertEquals(1, kittensCount);
    }
}
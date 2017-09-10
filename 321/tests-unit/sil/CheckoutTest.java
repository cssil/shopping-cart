package sil;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by silvestras on 10/09/2017.
 */
public class CheckoutTest {
    @Test
    public void getPriceTest() throws Exception {
        Checkout checkout = new Checkout();
        Assert.assertEquals(170L, checkout.getPrice(Arrays.asList("Apples", "Bananas", "Apples", "Limes", "Limes", "Limes", "Melons")));
        Assert.assertEquals(75L, checkout.getPrice(Arrays.asList("Limes", "Limes", "Limes", "Limes", "Limes", "Limes", "Limes")));
        Assert.assertEquals(60L, checkout.getPrice(Arrays.asList("Limes", "Limes", "Limes", "Limes", "Limes", "Limes")));
        Assert.assertEquals(30L, checkout.getPrice(Arrays.asList("Limes", "Limes", "Limes")));
        Assert.assertEquals(30L, checkout.getPrice(Arrays.asList("Limes", "Limes")));
        Assert.assertEquals(15L, checkout.getPrice(Arrays.asList("Limes")));
        Assert.assertEquals(150L, checkout.getPrice(Arrays.asList("Melons", "Melons", "Melons", "Melons", "Melons")));
        Assert.assertEquals(100L, checkout.getPrice(Arrays.asList("Melons", "Melons", "Melons", "Melons")));
        Assert.assertEquals(50L, checkout.getPrice(Arrays.asList("Melons", "Melons")));
        Assert.assertEquals(50L, checkout.getPrice(Arrays.asList("Melons")));
    }

}
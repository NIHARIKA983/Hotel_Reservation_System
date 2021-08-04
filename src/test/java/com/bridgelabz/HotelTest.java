package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class HotelTest {
    @Test
    public void givenHotelName_And_RegularCustomerRates_ShouldAddHotel() throws Exception {
        Hotel hotel=new Hotel();
        hotel.setHotelName("LakeWood");
        hotel.setRegularCustomerRates(110);
        Assert.assertEquals("LakeWood",hotel.getHotelName());
        Assert.assertEquals(110,hotel.getRegularCustomerRates());
    }
}

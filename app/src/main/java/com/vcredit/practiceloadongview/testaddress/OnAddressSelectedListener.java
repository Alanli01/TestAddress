package com.vcredit.practiceloadongview.testaddress;


import bean.City;
import bean.County;
import bean.Province;
import bean.Street;

public interface OnAddressSelectedListener {
    void onAddressSelected(Province province, City city, County county, Street street);
}

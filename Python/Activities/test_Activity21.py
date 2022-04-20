import pytest
def test_addition() :
    num1 =10
    num2=12
    sum=num1+num2
    assert sum==22
def test_difference() :
    num1=20
    num2=10
    diff = num1-num2
    assert  diff == 10
def test_product() :
    num1=5
    num2=20
    prod=num1*num2
    assert  prod==100
def test_quotient() :
    num1=20
    num2=5
    div=num1/num2
    assert  div==4

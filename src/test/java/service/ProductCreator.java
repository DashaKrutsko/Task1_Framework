package service;

import model.Product;

public class ProductCreator {

    public static final String TESTDATA_PRODUCT_TYPE = "testdata.product.productType";
    public static final String TESTDATA_NUMBER_OF_INSTANCES = "testdata.product.numberOfInstances";
    public static final String TESTDATA_PROVISION_MODEL = "testdata.product.provisioningModel";
    public static final String TESTDATA_OPERATING_SYSTEM = "testdata.product.operatingSystem";
    public static final String TESTDATA_MACHINE_FAMILY = "testdata.product.machineFamily";
    public static final String TESTDATA_SERIES = "testdata.product.series";
    public static final String TESTDATA_MACHINE_TYPE = "testdata.product.machineType";
    public static final String TESTDATA_HAVEGPU = "testdata.product.haveGPU";
    public static final String TESTDATA_TYPE_GPU = "testdata.product.typeGPU";
    public static final String TESTDATA_NUMBER_GPU = "testdata.product.numberGPU";
    public static final String TESTDATA_SSD = "testdata.product.ssd";
    public static final String TESTDATA_LOCATION = "testdata.product.location";
    public static final String TESTDATA_USAGE = "testdata.product.usage";

    public static Product createFromProperty(){

        return new Product(TestDataReader.getTestData(TESTDATA_PRODUCT_TYPE),
                           TestDataReader.getTestData(TESTDATA_NUMBER_OF_INSTANCES),
                           TestDataReader.getTestData(TESTDATA_PROVISION_MODEL),
                           TestDataReader.getTestData(TESTDATA_OPERATING_SYSTEM),
                           TestDataReader.getTestData(TESTDATA_MACHINE_FAMILY),
                           TestDataReader.getTestData(TESTDATA_SERIES),
                           TestDataReader.getTestData(TESTDATA_MACHINE_TYPE),
                           TestDataReader.getTestData(TESTDATA_HAVEGPU),
                           TestDataReader.getTestData(TESTDATA_TYPE_GPU),
                           TestDataReader.getTestData(TESTDATA_NUMBER_GPU),
                           TestDataReader.getTestData(TESTDATA_SSD),
                           TestDataReader.getTestData(TESTDATA_LOCATION),
                           TestDataReader.getTestData(TESTDATA_USAGE));
    }
}

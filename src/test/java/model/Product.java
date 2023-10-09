package model;

public class Product {

    private String productType;
    private String numberOfInstances;
    private String provisioningModel;
    private String operatingSystem;
    private String machineFamily;
    private String series;
    private String machineType;
    private String haveGPU;
    private String typeGPU;
    private String numberGPU;
    private String ssd;
    private String location;
    private String usage;
    private Double cost;

    public Product(String productType, String numberOfInstances, String provisioningModel, String operatingSystem, String machineFamily, String series, String machineType, String haveGPU, String typeGPU, String numberGPU, String ssd, String location, String usage) {
        this.productType = productType;
        this.numberOfInstances = numberOfInstances;
        this.provisioningModel = provisioningModel;
        this.operatingSystem = operatingSystem;
        this.machineFamily = machineFamily;
        this.series = series;
        this.machineType = machineType;
        this.haveGPU = haveGPU;
        this.typeGPU = typeGPU;
        this.numberGPU = numberGPU;
        this.ssd = ssd;
        this.location = location;
        this.usage = usage;

    }

    public Double getCost() {  return cost;   }

    public void setCost(Double cost) {  this.cost = cost;   }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getNumberOfInstances() {
        return numberOfInstances;
    }

    public void setNumberOfInstances(String numberOfInstances) {
        this.numberOfInstances = numberOfInstances;
    }

    public String getProvisioningModel() {
        return provisioningModel;
    }

    public void setProvisioningModel(String provisioningModel) {
        this.provisioningModel = provisioningModel;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getMachineFamily() {
        return machineFamily;
    }

    public void setMachineFamily(String machineFamily) {
        this.machineFamily = machineFamily;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getHaveGPU() {
        return haveGPU;
    }

    public void setHaveGPU(String haveGPU) { this.haveGPU = haveGPU;    }

    public String getTypeGPU() {
        return typeGPU;
    }

    public void setTypeGPU(String typeGPU) {
        this.typeGPU = typeGPU;
    }

    public String getNumberGPU() {
        return numberGPU;
    }

    public void setNumberGPU(String numberGPU) {
        this.numberGPU = numberGPU;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productType='" + productType + '\'' +
                ", numberOfInstances='" + numberOfInstances + '\'' +
                ", provisioningModel='" + provisioningModel + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", machineFamily='" + machineFamily + '\'' +
                ", series='" + series + '\'' +
                ", machineType='" + machineType + '\'' +
                ", haveGPU='" + haveGPU + '\'' +
                ", typeGPU='" + typeGPU + '\'' +
                ", numberGPU='" + numberGPU + '\'' +
                ", ssd='" + ssd + '\'' +
                ", location='" + location + '\'' +
                ", usage='" + usage + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (!getProductType().equals(product.getProductType())) return false;
        if (!getNumberOfInstances().equals(product.getNumberOfInstances())) return false;
        if (!getProvisioningModel().equals(product.getProvisioningModel())) return false;
        if (!getOperatingSystem().equals(product.getOperatingSystem())) return false;
        if (!getMachineFamily().equals(product.getMachineFamily())) return false;
        if (!getSeries().equals(product.getSeries())) return false;
        if (!getMachineType().equals(product.getMachineType())) return false;
        if (!getHaveGPU().equals(product.getHaveGPU())) return false;
        if (!getTypeGPU().equals(product.getTypeGPU())) return false;
        if (!getNumberGPU().equals(product.getNumberGPU())) return false;
        if (!getSsd().equals(product.getSsd())) return false;
        if (!getLocation().equals(product.getLocation())) return false;
        if (!getUsage().equals(product.getUsage())) return false;
        return getCost().equals(product.getCost());
    }

    @Override
    public int hashCode() {
        int result = getProductType().hashCode();
        result = 31 * result + getNumberOfInstances().hashCode();
        result = 31 * result + getProvisioningModel().hashCode();
        result = 31 * result + getOperatingSystem().hashCode();
        result = 31 * result + getMachineFamily().hashCode();
        result = 31 * result + getSeries().hashCode();
        result = 31 * result + getMachineType().hashCode();
        result = 31 * result + getHaveGPU().hashCode();
        result = 31 * result + getTypeGPU().hashCode();
        result = 31 * result + getNumberGPU().hashCode();
        result = 31 * result + getSsd().hashCode();
        result = 31 * result + getLocation().hashCode();
        result = 31 * result + getUsage().hashCode();
        result = 31 * result + getCost().hashCode();
        return result;
    }
}

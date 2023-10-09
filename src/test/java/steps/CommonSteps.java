package steps;

import model.Product;
import page.CalculatorPage;
import util.Utils;

public class CommonSteps{

    private Product product;
    private CalculatorPage page;

    public CommonSteps(Product product,CalculatorPage page){
        this.product = product;
        this.page = page;
    }

    public Double calculateCost() {
        page.clickButtonCookies()
                .selectFrames()
                .insertComputeEngine(product.getProductType())
                .insertNumberOfInstances(product.getNumberOfInstances())
                .selectOperatingSystem(product.getOperatingSystem())
                .selectProvisioningModel(product.getProvisioningModel())
                .selectMachineFamily(product.getMachineFamily())
                .selectSeries(product.getSeries())
                .selectMachineType(product.getMachineType())
                .selectAddGPU(product.getHaveGPU())
                .selectTypeGPU(product.getTypeGPU())
                .selectNumberGPU(product.getNumberGPU())
                .selectSSD(product.getSsd())
                .selectLocation(product.getLocation())
                .selectUsage(product.getUsage())
                .clickAddToEstimate();

        String costEstimatedString = page.getStringEstimatedCost();
        return Utils.getDoubleCost(costEstimatedString);
    }
}

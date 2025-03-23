package nz.co.assurity.automation.pages;

import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

public class CategoryPage {
    private final Response response;

    public CategoryPage(Response response) {
        this.response = response;
    }

    public String getCategoryName() {
        return response.jsonPath().getString("Name");
    }

    public boolean canRelist() {
        return response.jsonPath().getBoolean("CanRelist");
    }
    public boolean isGalleryPromotionValid() {
        List<Map<String, String>> promotions = response.jsonPath().getList("Promotions");

        for (Map<String, String> promo : promotions) {
            if ("Gallery".equals(promo.get("Name")) && promo.get("Description").contains("Good position in category")) {
                return true;
            }
        }
        return false;
    }
}

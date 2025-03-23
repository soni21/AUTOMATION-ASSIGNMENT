import io.restassured.response.Response;
import nz.co.assurity.automation.api.CategoryAPI;
import nz.co.assurity.automation.pages.CategoryPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CategoryTest {

    @Test
    public void testCategoryName() {
        Response response = CategoryAPI.getCategoryDetails();
        CategoryPage categoryPage = new CategoryPage(response);

        assertEquals("Carbon credits", categoryPage.getCategoryName(), "Category name is incorrect");
    }

    @Test
    public void testCanRelist() {
        Response response = CategoryAPI.getCategoryDetails();
        CategoryPage categoryPage = new CategoryPage(response);

        assertTrue(categoryPage.canRelist(), "CanRelist value is not true");
    }

    @Test
    public void testGalleryPromotion() {
        Response response = CategoryAPI.getCategoryDetails();
        CategoryPage categoryPage = new CategoryPage(response);

        assertTrue(categoryPage.isGalleryPromotionValid(), "Description is incorrect for Gallery Promotion");
    }
}

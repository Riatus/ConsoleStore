import common.AppView;
import common.PageLoop;
import data.data_source.Catalog.CatalogDataSource;
import data.data_source.Catalog.MockCatalogDataSourceImpl;
import data.data_source.cart.CartDataSource;
import data.data_source.cart.MockCartDataSourceImp;
import data.data_source.order.MockOrderDataSourceImp;
import data.data_source.order.OrderDataSource;
import data.service.ShopService;
import view.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CartDataSource cartDataSource = new MockCartDataSourceImp();
        CatalogDataSource catalogDataSource = new MockCatalogDataSourceImpl();
        OrderDataSource orderDataSource = new MockOrderDataSourceImp();
        ShopService shopService = new ShopService(catalogDataSource,cartDataSource,orderDataSource);

        AppView addToCartView = new AddToCartView(shopService);

        ArrayList<AppView> catalogChildren = new ArrayList<>();
        catalogChildren.add(addToCartView);
        AppView catalogView = new CatalogView(shopService,catalogChildren);

        AppView cartView = new CartView(shopService);

        AppView orderView = new OrderView(shopService);


        ArrayList<AppView> mainChildren = new ArrayList<>();
        mainChildren.add(catalogView);
        mainChildren.add(cartView);
        mainChildren.add(orderView);
        AppView mainView = new MainView(mainChildren);

        new PageLoop(mainView).run();

//
//        System.out.println(shopService.getCatalog());
//        System.out.println(shopService.getCart());
//        System.out.println(shopService.addToCart(shopService.getCatalog().get(0).id,5));
//        System.out.println(shopService.getCart());
    }
}

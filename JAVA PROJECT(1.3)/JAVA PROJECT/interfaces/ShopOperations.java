package interfaces;

import classes.*;

public interface ShopOperations
{
	void insertShop(Shop s);
	void removeShop(Shop s);
	Shop getShop(String sid);
	void showAllShops(); 
}
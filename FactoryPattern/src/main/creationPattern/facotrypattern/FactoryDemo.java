package main.creationPattern.facotrypattern;

import main.creationPattern.facotrypattern.website.Website;

public class FactoryDemo {
    public static void main(String[] args) {
        Website shop = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(shop.getPages());

        Website blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(blog.getPages());
    }
}

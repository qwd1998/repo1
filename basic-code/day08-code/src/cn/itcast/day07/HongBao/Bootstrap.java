package cn.itcast.day07.HongBao;

import cn.itcast.day07.red.OpenMode;

import java.util.ArrayList;

public class Bootstrap {
    public static void main(String[] args) {
        My red = new My("嘿嘿嘿");
        red.setOwnerName("毛俊");
        OpenMode normal = new Normal();
        red.setOpenWay(normal);
    }
}

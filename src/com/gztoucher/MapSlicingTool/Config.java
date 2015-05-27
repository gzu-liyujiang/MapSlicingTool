package com.gztoucher.MapSlicingTool;

public class Config {
    public static String imgPath = "E:/workspace/MapSlicingTool/map.jpg";// 待裁剪的图片
    public static String saveDirPath = "E:/workspace/MapSlicingTool/";// 裁剪后的保存路径
    public static String name = "map";
    public static int tileSize = 256;// 瓦片的大小
    public static int pointTopLeftX = 20;// 左上角图片X坐标
    public static int pointTopLeftY = 28;// 左上角图片Y坐标
    //坐标拾取器：http://api.map.baidu.com/lbsapi/getpoint/，如核桃冲：105.178774,26.824964
    public static double pointTopLeftLat = 26.846441;// 左上角纬度//
    public static double pointTopLeftLon = 105.129304;// 左上角经度
    public static int pointBottomRightX = 1348;// 右下角图片X坐标
    public static int pointBottomRightY = 389;// 右下角图片Y坐标
    public static double pointBottomRightLat = 26.823279;// 右下角纬度
    public static double pointBottomRightLon = 105.2243;// 右下角经度
}

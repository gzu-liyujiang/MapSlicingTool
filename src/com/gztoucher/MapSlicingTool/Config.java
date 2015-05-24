package com.gztoucher.MapSlicingTool;

public class Config {
	public static String imgPath = "E:/map.jpg";// 待裁剪的图片
	public static String saveDirPath = "E:/";// 裁剪后的保存路径
	public static String name = "map";
	public static int tileSize = 256;// 瓦片的大小
	public static int pointTopLeftX = 180;// 左上角屏幕X坐标
	public static int pointTopLeftY = 200;// 左上角屏幕Y坐标
	public static double pointTopLeftLat = 26.4428;// 左上角纬度
	public static double pointTopLeftLon = 106.6738;// 左上角经度
	public static int pointBottomRightX = 900;// 右下角屏幕X坐标
	public static int pointBottomRightY = 700;// 右下角屏幕Y坐标
	public static double pointBottomRightLat = 26.6324;// 右下角纬度
	public static double pointBottomRightLon = 106.5553;// 右下角经度
}

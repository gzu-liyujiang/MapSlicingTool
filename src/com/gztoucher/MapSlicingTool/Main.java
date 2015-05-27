package com.gztoucher.MapSlicingTool;

import com.ls.mappwidget.slicingtool.cutter.Cutter;
import com.ls.mappwidget.slicingtool.cutter.OnCompliteListener;
import com.ls.mappwidget.slicingtool.cutter.OnProgressUpdateListener;
import com.ls.mappwidget.slicingtool.vo.PointVO;

/**
 * 地图裁剪工具。
 * 详见：https://github.com/lemberg/mappwidget
 *
 * @author liyujiang<QQ:1032694760>
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Cutter cutter = new Cutter(new OnProgressUpdateListener() {
            @Override
            public void onProgressUpdate(int value) {
                System.out.println("progress: " + value);
            }
        }, new OnCompliteListener() {

            @Override
            public void onComplite() {
                System.out.println("finish");
            }
        });
        PointVO pointTopLeft = new PointVO();
        pointTopLeft.setX(Config.pointTopLeftX);
        pointTopLeft.setY(Config.pointTopLeftY);
        pointTopLeft.setLat(Config.pointTopLeftLat);
        pointTopLeft.setLon(Config.pointTopLeftLon);
        PointVO pointBottomRight = new PointVO();
        pointBottomRight.setX(Config.pointBottomRightX);
        pointBottomRight.setY(Config.pointBottomRightY);
        pointBottomRight.setLat(Config.pointBottomRightLat);
        pointBottomRight.setLon(Config.pointBottomRightLon);
        cutter.startCuttingAndroid(Config.imgPath, Config.saveDirPath,
                Config.name, Config.tileSize, pointTopLeft, pointBottomRight);
    }

}

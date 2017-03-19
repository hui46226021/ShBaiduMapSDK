# ShBaiduMapSDK
封装百度地图

* 导入baidumap_sdk
* 修改string.xml 里的key

~~~java
        /**
         * 初始化百度地图
         */
        BaiduMapHelper.init(this);
~~~

## JrMapView
将所有的 地图操作 封装到JrMapView 里面便于以后管理
~~~xml
 <com.sh.zsh.code.baidumap_sdk.view.JrMapView
        android:id="@+id/bmapView"
        android:layout_width="fill_parent"
        android:layout_height="fill_parent"
        android:clickable="true" />
~~~
封装方法
~~~java

/**
 * Created by zhush on 2017/3/19.
 * E-mail 405086805@qq.com
 * PS 封装地图  为了隔离第三方SDK 便于更换
 * setMapDisplayType   设置地图显示类型
 * openTraffic         开启交通地图
 * setBaiduHeatMapEnabled  开启热力地图
 * addTagging           在地图标注 res 支援图片   view 视图
 * addText              文字覆盖
 * removeOverlay        删除点
 * perfomZoom           地图缩放
 * perfomRotate         旋转地图
 * clear                清楚地图上的点
 * locationView         定位图层
 */
~~~

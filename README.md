## 利用RecyelerView打造的炫酷滑动卡片，支持左滑右滑删除

### 集成

#### Android Studio  
**1.在项目根目录 build.gradle文件中加入：**

	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
**2.在app build.gradle文件中添加依赖**

	dependencies {
	        compile 'com.github.HalfStackDeveloper:SwipeCardRecyclerView:v1.0.0'
	}

### 具体细节可移步[《如何利用RecyclerView打造炫酷滑动卡片》](http://www.jianshu.com/p/7977006d2d6a)，欢迎大家fork AND star！

### 动画效果

![](http://od35ecbnl.bkt.clouddn.com/swipecard.gif)
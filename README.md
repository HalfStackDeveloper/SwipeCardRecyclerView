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

### 使用 (参见demo)
**1.RecyclerView设置**

	mRecyclerView = (SwipeCardRecyclerView) findViewById(R.id.recyclerView);
	mRecyclerView.setLayoutManager(new SwipeCardLayoutManager());
	
	mAdapter = new MyAdapter(this, list);
	mRecyclerView.setAdapter(mAdapter);
	
**2.创建继承自SwipeCardAdapter的adapter**

	class MyAdapter extends SwipeCardAdapter

### 具体细节可移步[《如何利用RecyclerView打造炫酷滑动卡片》](http://www.jianshu.com/p/7977006d2d6a)，欢迎大家fork AND star！

### 动画效果
![](http://od35ecbnl.bkt.clouddn.com/swipecard.gif)

### 开源协议

	Copyright （C）2016, 汪先登

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.


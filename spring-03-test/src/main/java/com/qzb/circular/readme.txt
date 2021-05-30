循环依赖问题
构造器循环依赖解决不了，会报错
set注入可以解决循环依赖问题，必须使用三级缓存（三级缓存可以解决在循环依赖中，早起暴露出去的被使用的bean）


https://mp.weixin.qq.com/s/pBo5NkBwPwA_WATGe2xugQ
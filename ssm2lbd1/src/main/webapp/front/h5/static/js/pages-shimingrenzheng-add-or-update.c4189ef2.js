(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-shimingrenzheng-add-or-update"],{"3ebd":function(e,t,r){var i=r("8219");"string"===typeof i&&(i=[[e.i,i,""]]),i.locals&&(e.exports=i.locals);var n=r("4f06").default;n("35011ea2",i,!0,{sourceMap:!1,shadowMode:!1})},"43fb":function(e,t,r){"use strict";r.r(t);var i=r("568c"),n=r.n(i);for(var o in i)"default"!==o&&function(e){r.d(t,e,(function(){return i[e]}))}(o);t["default"]=n.a},"568c":function(e,t,r){"use strict";var i=r("4ea4");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,r("ac6a"),r("28a5"),r("96cf");var n=i(r("3b8d")),o=i(r("e2b1")),a={data:function(){return{ruleForm:{xingming:"",shenfenzheng:"",shoujihaoma:"",nianling:"",xingbie:"",touxiang:"",yonghuming:"",userid:""},xingbieOptions:[],xingbieIndex:0,user:{},ro:{xingming:!1,shenfenzheng:!1,shoujihaoma:!1,nianling:!1,xingbie:!1,touxiang:!1,yonghuming:!1,userid:!1}}},components:{wPicker:o.default},computed:{},onLoad:function(){var e=(0,n.default)(regeneratorRuntime.mark((function e(t){var r,i,n,o;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return r=uni.getStorageSync("nowTable"),e.next=3,this.$api.session(r);case 3:if(i=e.sent,this.user=i.data,this.ruleForm.yonghuming=this.user.yonghuming,this.xingbieOptions="男,女".split(","),this.ruleForm.userid=uni.getStorageSync("userid"),t.refid&&(this.ruleForm.refid=t.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!t.id){e.next=15;break}return this.ruleForm.id=t.id,e.next=13,this.$api.info("shimingrenzheng",this.ruleForm.id);case 13:i=e.sent,this.ruleForm=i.data;case 15:if(!t.cross){e.next=54;break}n=uni.getStorageSync("crossObj"),e.t0=regeneratorRuntime.keys(n);case 18:if((e.t1=e.t0()).done){e.next=54;break}if(o=e.t1.value,"xingming"!=o){e.next=24;break}return this.ruleForm.xingming=n[o],this.ro.xingming=!0,e.abrupt("continue",18);case 24:if("shenfenzheng"!=o){e.next=28;break}return this.ruleForm.shenfenzheng=n[o],this.ro.shenfenzheng=!0,e.abrupt("continue",18);case 28:if("shoujihaoma"!=o){e.next=32;break}return this.ruleForm.shoujihaoma=n[o],this.ro.shoujihaoma=!0,e.abrupt("continue",18);case 32:if("nianling"!=o){e.next=36;break}return this.ruleForm.nianling=n[o],this.ro.nianling=!0,e.abrupt("continue",18);case 36:if("xingbie"!=o){e.next=40;break}return this.ruleForm.xingbie=n[o],this.ro.xingbie=!0,e.abrupt("continue",18);case 40:if("touxiang"!=o){e.next=44;break}return this.ruleForm.touxiang=n[o],this.ro.touxiang=!0,e.abrupt("continue",18);case 44:if("yonghuming"!=o){e.next=48;break}return this.ruleForm.yonghuming=n[o],this.ro.yonghuming=!0,e.abrupt("continue",18);case 48:if("userid"!=o){e.next=52;break}return this.ruleForm.userid=n[o],this.ro.userid=!0,e.abrupt("continue",18);case 52:e.next=18;break;case 54:this.styleChange();case 55:case"end":return e.stop()}}),e,this)})));function t(t){return e.apply(this,arguments)}return t}(),methods:{styleChange:function(){this.$nextTick((function(){}))},xingbieChange:function(e){this.xingbieIndex=e.target.value,this.ruleForm.xingbie=this.xingbieOptions[this.xingbieIndex]},touxiangTap:function(){var e=this;this.$api.upload((function(t){e.ruleForm.touxiang=e.$base.url+"upload/"+t.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=(0,n.default)(regeneratorRuntime.mark((function e(){return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(!this.ruleForm.shenfenzheng||this.$validate.checkIdCard(this.ruleForm.shenfenzheng)){e.next=3;break}return this.$utils.msg("身份证应输入身份证格式"),e.abrupt("return");case 3:if(!this.ruleForm.shoujihaoma||this.$validate.isMobile(this.ruleForm.shoujihaoma)){e.next=6;break}return this.$utils.msg("手机号码应输入手机格式"),e.abrupt("return");case 6:if(!this.ruleForm.nianling||this.$validate.isIntNumer(this.ruleForm.nianling)){e.next=9;break}return this.$utils.msg("年龄应输入整数"),e.abrupt("return");case 9:if(!this.ruleForm.id){e.next=14;break}return e.next=12,this.$api.update("shimingrenzheng",this.ruleForm);case 12:e.next=16;break;case 14:return e.next=16,this.$api.add("shimingrenzheng",this.ruleForm);case 16:this.$utils.msgBack("提交成功");case 17:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var t=new Date,r=t.getFullYear(),i=t.getMonth()+1,n=t.getDate();return"start"===e?r-=60:"end"===e&&(r+=2),i=i>9?i:"0"+i,n=n>9?n:"0"+n,"".concat(r,"-").concat(i,"-").concat(n)},toggleTab:function(e){this.$refs[e].show()}}};t.default=a},"58d4":function(e,t,r){"use strict";var i,n=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("v-uni-view",{staticClass:"content"},[r("v-uni-form",{staticClass:"app-update-pv"},[r("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 0px rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 1)",borderColor:"rgba(240, 239, 239, 1)",margin:"0",borderWidth:"0 0 2rpx 0",borderStyle:"solid",height:"108rpx"}},[r("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(147, 193, 7, 1)",textAlign:"left"}},[e._v("姓名")]),r("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",borderColor:"rgba(215, 215, 215, 1)",borderRadius:"0px",color:"rgba(255, 144, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{disabled:e.ro.xingming,placeholder:"姓名"},model:{value:e.ruleForm.xingming,callback:function(t){e.$set(e.ruleForm,"xingming",t)},expression:"ruleForm.xingming"}})],1),r("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 0px rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 1)",borderColor:"rgba(240, 239, 239, 1)",margin:"0",borderWidth:"0 0 2rpx 0",borderStyle:"solid",height:"108rpx"}},[r("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(147, 193, 7, 1)",textAlign:"left"}},[e._v("身份证")]),r("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",borderColor:"rgba(215, 215, 215, 1)",borderRadius:"0px",color:"rgba(255, 144, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{disabled:e.ro.shenfenzheng,placeholder:"身份证"},model:{value:e.ruleForm.shenfenzheng,callback:function(t){e.$set(e.ruleForm,"shenfenzheng",t)},expression:"ruleForm.shenfenzheng"}})],1),r("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 0px rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 1)",borderColor:"rgba(240, 239, 239, 1)",margin:"0",borderWidth:"0 0 2rpx 0",borderStyle:"solid",height:"108rpx"}},[r("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(147, 193, 7, 1)",textAlign:"left"}},[e._v("手机号码")]),r("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",borderColor:"rgba(215, 215, 215, 1)",borderRadius:"0px",color:"rgba(255, 144, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{disabled:e.ro.shoujihaoma,placeholder:"手机号码"},model:{value:e.ruleForm.shoujihaoma,callback:function(t){e.$set(e.ruleForm,"shoujihaoma",t)},expression:"ruleForm.shoujihaoma"}})],1),r("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 0px rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 1)",borderColor:"rgba(240, 239, 239, 1)",margin:"0",borderWidth:"0 0 2rpx 0",borderStyle:"solid",height:"108rpx"}},[r("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(147, 193, 7, 1)",textAlign:"left"}},[e._v("年龄")]),r("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",borderColor:"rgba(215, 215, 215, 1)",borderRadius:"0px",color:"rgba(255, 144, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{disabled:e.ro.nianling,placeholder:"年龄"},model:{value:e.ruleForm.nianling,callback:function(t){e.$set(e.ruleForm,"nianling",t)},expression:"ruleForm.nianling"}})],1),r("v-uni-view",{staticClass:"cu-form-group select",style:{boxShadow:"0 0 0px rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 1)",borderColor:"#ccc",margin:"0",borderWidth:"0 0 2rpx 0",borderStyle:"solid",height:"108rpx"}},[r("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(147, 193, 7, 1)",textAlign:"left"}},[e._v("性别")]),r("v-uni-picker",{attrs:{value:e.xingbieIndex,range:e.xingbieOptions},on:{change:function(t){arguments[0]=t=e.$handleEvent(t),e.xingbieChange.apply(void 0,arguments)}}},[r("v-uni-view",{staticClass:"uni-input",style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(215, 215, 215, 1)",borderRadius:"0px",color:"rgba(255, 144, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"}},[e._v(e._s(e.ruleForm.xingbie?e.ruleForm.xingbie:"请选择性别"))])],1)],1),r("v-uni-view",{staticClass:"cu-form-group",class:"left"==e.left?"":"active",style:{boxShadow:"0 0 0px rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 1)",borderColor:"#ccc",margin:"0",borderWidth:"0 0 2rpx 0",borderStyle:"solid",height:"108rpx"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.touxiangTap.apply(void 0,arguments)}}},[r("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(147, 193, 7, 1)",textAlign:"left"}},[e._v("头像")]),r("v-uni-view",{staticClass:"right-input",staticStyle:{padding:"0"},style:{textAlign:"left"}},[e.ruleForm.touxiang?r("v-uni-image",{staticClass:"avator",style:{width:"88rpx",boxShadow:"0 0 16rpx rgba(0,0,0,.3)",borderRadius:"100%",textAlign:"left",height:"88rpx"},attrs:{src:e.ruleForm.touxiang,mode:"aspectFill"}}):r("v-uni-image",{staticClass:"avator",style:{width:"88rpx",boxShadow:"0 0 16rpx rgba(0,0,0,.3)",borderRadius:"100%",textAlign:"left",height:"88rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1)],1),r("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 0px rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 1)",borderColor:"rgba(240, 239, 239, 1)",margin:"0",borderWidth:"0 0 2rpx 0",borderStyle:"solid",height:"108rpx"}},[r("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(147, 193, 7, 1)",textAlign:"left"}},[e._v("用户名")]),r("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",borderColor:"rgba(215, 215, 215, 1)",borderRadius:"0px",color:"rgba(255, 144, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{disabled:e.ro.yonghuming,placeholder:"用户名"},model:{value:e.ruleForm.yonghuming,callback:function(t){e.$set(e.ruleForm,"yonghuming",t)},expression:"ruleForm.yonghuming"}})],1),r("v-uni-view",{staticClass:"btn"},[r("v-uni-button",{staticClass:"bg-red",style:{boxShadow:"0 0 16rpx rgba(0,0,0,0) inset",backgroundColor:"rgba(147, 193, 7, 1)",borderColor:"rgba(147, 193, 7, 1)",borderRadius:"8rpx",color:"#fff",borderWidth:"1",width:"80%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onSubmitTap.apply(void 0,arguments)}}},[e._v("提交")])],1)],1)],1)},o=[];r.d(t,"b",(function(){return n})),r.d(t,"c",(function(){return o})),r.d(t,"a",(function(){return i}))},8219:function(e,t,r){var i=r("24fb");t=i(!1),t.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.container[data-v-46d10d22]{padding:%?20?%}.content[data-v-46d10d22]:after{position:fixed;top:0;right:0;left:0;bottom:0;content:"";background-attachment:fixed;background-size:cover;background-position:50%}uni-textarea[data-v-46d10d22]{border:%?1?% solid #eee;border-radius:%?20?%;padding:%?20?%}.title[data-v-46d10d22]{width:%?180?%}.avator[data-v-46d10d22]{width:%?150?%;height:%?60?%}.right-input[data-v-46d10d22]{-webkit-box-flex:1;-webkit-flex:1;flex:1;text-align:left;padding:0 %?24?%}.cu-form-group.active[data-v-46d10d22]{-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between}.btn[data-v-46d10d22]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;-webkit-flex-wrap:wrap;flex-wrap:wrap;padding:%?20?% 0}.cu-form-group[data-v-46d10d22]{padding:0 %?24?%;background-color:initial;min-height:inherit}.cu-form-group + .cu-form-group[data-v-46d10d22]{border:0}.cu-form-group uni-input[data-v-46d10d22]{padding:0 %?30?%}.uni-input[data-v-46d10d22]{padding:0 %?30?%}.cu-form-group uni-textarea[data-v-46d10d22]{padding:%?30?%;margin:0}.cu-form-group uni-picker[data-v-46d10d22]::after{line-height:%?88?%}.select .uni-input[data-v-46d10d22]{line-height:%?88?%}.input .right-input[data-v-46d10d22]{line-height:%?88?%}',""]),e.exports=t},b3f0:function(e,t,r){"use strict";var i=r("3ebd"),n=r.n(i);n.a},d3ff:function(e,t,r){"use strict";r.r(t);var i=r("58d4"),n=r("43fb");for(var o in n)"default"!==o&&function(e){r.d(t,e,(function(){return n[e]}))}(o);r("b3f0");var a,s=r("f0c5"),u=Object(s["a"])(n["default"],i["b"],i["c"],!1,null,"46d10d22",null,!1,i["a"],a);t["default"]=u.exports}}]);
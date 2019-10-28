package com.haobi.appbarlayoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mTextView = (TextView)findViewById(R.id.tv);
        mTextView.setText("安卓（Android）是一种基于Linux的自由及开放源代码的操作系统。主要使用于移动设备，如智能手机和平板电脑，由Google公司和开放手机联盟领导及开发。Android操作系统最初由Andy Rubin开发，主要支持手机。2005年8月由Google收购注资。2007年11月，Google与84家硬件制造商、软件开发商及电信营运商组建开放手机联盟共同研发改良Android系统。随后Google以Apache开源许可证的授权方式，发布了Android的源代码。第一部Android智能手机发布于2008年10月。Android逐渐扩展到平板电脑及其他领域上，如电视、数码相机、游戏机、智能手表等。2011年第一季度，Android在全球的市场份额首次超过塞班系统，跃居全球第一。 2013年的第四季度，Android平台手机的全球市场份额已经达到78.1%。2013年09月24日谷歌开发的操作系统Android在迎来了5岁生日，全世界采用这款系统的设备数量已经达到10亿台。\n" +
                "2014第一季度Android平台已占所有移动广告流量来源的42.8%，首度超越iOS。但运营收入不及iOS。Android一词的本义指“机器人”，同时也是Google于2007年11月5日\n" +
                "Android  logo相关图片\n" +
                "Android logo相关图片(32张)\n" +
                " 宣布的基于Linux平台的开源手机操作系统的名称，该平台由操作系统、中间件、用户界面和应用软件组成。\n" +
                "Android一词最早出现于法国作家利尔亚当（Auguste Villiers de l'Isle-Adam）在1886年发表的科幻小说《未来夏娃》（L'ève future）中。他将外表像人的机器起名为Android。\n" +
                "Android的Logo是由Ascender公司设计的，诞生于2010年，其设计灵感源于男女厕所门上的图形符号，于是布洛克绘制了一个简单的机器人，它的躯干就像锡罐的形状，头上还有两根天线，Android小机器人便诞生了。其中的文字使用了Ascender公司专门制作的称之为“Droid ” 的字体。Android是一个全身绿色的机器人，绿色也是Android的标志。颜色采用了PMS 376C和RGB中十六进制的#A4C639来绘制，这是Android操作系统的品牌象徵。有时候，它们还会使用纯文字的Logo。\n" +
                "2012年7月美国科技博客网站BusinessInsider评选出二十一世纪十款最重要电子产品，Android操作系统和iPhone等榜上有名。2003年10月，Andy Rubin等人创建Android公司，并组建Android团队。\n" +
                "2005年8月17日，Google低调收购了成立仅22个月的高科技企业Android及其团队。安迪鲁宾成为Google公司工程部副总裁，继续负责Android项目。\n" +
                "2007年11月5日，谷歌公司正式向外界展示了这款名为Android的操作系统，并且在这天谷歌宣布建立一个全球性的联盟组织，该组织由34家手机制造商、软件开发商、电信运营商以及芯片制造商共同组成，并与84家硬件制造商、软件开发商及电信营运商组成开放手持设备联盟（Open Handset Alliance）来共同研发改良Android系统，这一联盟将支持谷歌发布的手机操作系统以及应用软件，Google以Apache免费开源许可证的授权方式，发布了Android的源代码。 [3-4] \n" +
                "2008年，在GoogleI/O大会上，谷歌提出了AndroidHAL架构图，在同年8月18号，Android获得了美国联邦通信委员会（FCC）的批准，在2008年9月，谷歌正式发布了Android 1.0系统，这也是Android系统最早的版本。\n" +
                "2009年4月，谷歌正式推出了Android 1.5这款手机，从Android 1.5版本开始，谷歌开始将Android的版本以甜品的名字命名，Android 1.5命名为Cupcake（纸杯蛋糕）。该系统与Android 1.0相比有了很大的改进。\n" +
                "2009年9月，谷歌发布了Android 1.6的正式版，并且推出了搭载Android 1.6正式版的手机HTC Hero（G3），凭借着出色的外观设计以及全新的Android 1.6操作系统，HTC Hero（G3）成为当时全球最受欢迎的手机。Android 1.6也有一个有趣的甜品名称，它被称为Donut（甜甜圈）。\n" +
                "2010年2月，Linux内核开发者Greg Kroah-Hartman将Android的驱动程序从Linux内核“状态树”（“staging tree”）上除去，从此，Android与Linux开发主流将分道扬镳。在同年5月份，谷歌正式发布了Android 2.2操作系统。谷歌将Android 2.2操作系统命名为Froyo，翻译完名为冻酸奶。\n" +
                "2010年10月，谷歌宣布Android系统达到了第一个里程碑，即电子市场上获得官方数字认证的Android应用数量已经达到了10万个，Android系统的应用增长非常迅速。在2010年12月，谷歌正式发布了Android 2.3操作系统Gingerbread （姜饼）。\n" +
                "2011年1月，谷歌称每日的Android设备新用户数量达到了30万部，到2011年7月，这个数字增长到55万部，而Android系统设备的用户总数达到了1.35亿，Android系统已经成为智能手机领域占有量最高的系统。\n" +
                "2011年8月2日，Android手机已占据全球智能机市场48%的份额，并在亚太地区市场占据统治地位，终结了Symbian（塞班系统）的霸主地位，跃居全球第一。\n" +
                "2011年9月，Android系统的应用数目已经达到了48万，而在智能手机市场，Android系统的占有率已经达到了43%。继续在排在移动操作系统首位。谷歌将会发布全新的Android 4.0操作系统，这款系统被谷歌命名为Ice Cream Sandwich（冰激凌三明治）。\n" +
                "2012年1月6日，谷歌Android Market已有10万开发者推出超过40万活跃的应用，大多数的应用程序为免费。Android Market应用程序商店目录在新年首周周末突破40万基准，距离突破30万应用仅4个月。在2011年早些时候，Android Market从20万增加到30万应用也花了四个月。 [5] \n" +
                "2013年11月1日，Android4.4正式发布，从具体功能上讲，Android4.4提供了各种实用小功能，新的Android系统更智能，添加更多的Emoji表情图案，UI的改进也更现代，如全新的HelloiOS7半透明效果。\n" +
                "2015年，网络安全公司Zimperium研究人员警告，安卓(Android)存在“致命”安全漏洞,黑客发送一封彩信便能在用户毫不知情的情况下完全控制手机。 [6] \n" +
                "2018年10月，谷歌表示，将于2018年12月6日停止Android系统中的Nearby Notifications（附近通知）服务，因为Android用户收到太多的附近商家推销信息的垃圾邮件。 [7] ");

    }
}

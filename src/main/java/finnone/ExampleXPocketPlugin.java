import com.perfma.xlab.xpocket.spi.AbstractXPocketPlugin;
import com.perfma.xlab.xpocket.spi.context.SessionContext;
import com.perfma.xlab.xpocket.spi.process.XPocketProcess;

/**
 * 这个类主要用于插件整体的声明周期管理和日志输出等，如非必要可以不实现
 * @author gongyu <yin.tong@perfma.com>
 */
public class ExampleXPocketPlugin extends AbstractXPocketPlugin {

    private static final String LOGO = " __  ______            _        _   \n" +
                                       " \\ \\/ /  _ \\ ___   ___| | _____| |_ \n" +
                                       "  \\  /| |_) / _ \\ / __| |/ / _ \\ __|\n" +
                                       "  /  \\|  __/ (_) | (__|   <  __/ |_ \n" +
                                       " /_/\\_\\_|   \\___/ \\___|_|\\_\\___|\\__|";
    
    /**
     * 用于输出自定义LOGO
     * @param process 
     */
    @Override
    public void printLogo(XPocketProcess process) {
        process.output(LOGO);
    }

    /**
     * 插件会话被切出时被调用
     * @param context 
     */
    @Override
    public void switchOff(SessionContext context) {
        super.switchOff(context); 
    }

    /**
     * 插件会话被切入时被调用
     * @param context 
     */
    @Override
    public void switchOn(SessionContext context) {
        super.switchOn(context); 
    }

    /**
     * XPocket整体退出时被调用，用于清理插件本身使用的资源
     * @throws Throwable 
     */
    @Override
    public void destory() throws Throwable {
        super.destory(); 
    }

    /**
     * 插件首次被初始化时被调用
     * @param process 
     */
    @Override
    public void init(XPocketProcess process) {
        super.init(process); 
    }  
    
}
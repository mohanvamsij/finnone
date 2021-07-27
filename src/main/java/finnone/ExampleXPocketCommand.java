import com.perfma.xlab.xpocket.spi.command.AbstractXPocketCommand;
import com.perfma.xlab.xpocket.spi.command.CommandInfo;
import com.perfma.xlab.xpocket.spi.command.XPocketProcessTemplate;
import com.perfma.xlab.xpocket.spi.process.XPocketProcess;
import java.util.Arrays;

/**
 * 用于实现每个命令的核心逻辑，一个或者多个命令指向一个类。
 * @author gongyu <yin.tong@perfma.com>
 */
@CommandInfo(name = "example1", usage = "demo command 1", index = 0)
@CommandInfo(name = "example2", usage = "demo command 2", index = 1)
public class ExampleXPocketCommand extends AbstractXPocketCommand {

    @Override
    public void invoke(XPocketProcess process) throws Throwable {
        XPocketProcessTemplate.execute(process, 
                (String cmd, String[] args) -> 
                {
                    //do anything in this block
                    String.format("EXECUTION %s %s",cmd , 
                        args == null ? null : Arrays.toString(args)));
                }
    }

}
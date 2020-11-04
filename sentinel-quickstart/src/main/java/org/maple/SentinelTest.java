package org.maple;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author mapleins
 */
public class SentinelTest {

    public static void main(String[] args) {
        initFlowRules();
        while (true) {
            doSth();
        }
    }

    private static void doSth(){
        try(Entry entry = SphU.entry("doSth")){
            System.out.println("当前时间: " + LocalDateTime.now());
        } catch (BlockException e) {
            //  BlockException 流量被控制
            System.out.println("阻止");
        }
    }

    private static void initFlowRules() {
        List<FlowRule> rules = new ArrayList<>();
        FlowRule rule = new FlowRule();
        rule.setResource("doSth");
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        rule.setCount(10);
        rules.add(rule);
        FlowRuleManager.loadRules(rules);
    }
}

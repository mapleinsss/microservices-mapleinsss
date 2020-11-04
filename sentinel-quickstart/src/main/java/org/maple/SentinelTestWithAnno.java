package org.maple;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mapleins
 * todo 失败
 */
public class SentinelTestWithAnno {

    public static void main(String[] args) {
        initFlowRules();
        while (true) {
            System.out.println(doSth());
        }
    }

    @SentinelResource(value = "doSth", blockHandler = "blockHandlerForDoSth")
    private static String doSth() {
        return "pass";
    }

    private static String blockHandlerForDoSth() {
        return "block";
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

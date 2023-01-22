package studio.dreamys;

import com.sun.tools.attach.VirtualMachine;
import com.sun.tools.attach.VirtualMachineDescriptor;

import javax.swing.*;
import java.util.Arrays;
import java.util.Optional;

public class Swipe {
    public static void main(String[] args) {
        //get info of the first vm matching a minecraft process
        Optional<VirtualMachineDescriptor> vmd = VirtualMachine.list().stream().filter(vm -> vm.displayName().contains("net.minecraft")).findFirst();

        //if no compatible minecraft process was found, exit
        if (!vmd.isPresent()) return;

        //get vm args
        String[] vmArgs = vmd.get().displayName().split(" ");

        //get index of accessToken argument
        int accessTokenIndex = Arrays.asList(vmArgs).indexOf("--accessToken");

        //if no access token was found to be passed, exit
        if (accessTokenIndex == -1) return;

        //show token
        JOptionPane.showMessageDialog(null, vmArgs[accessTokenIndex + 1]);
    }
}

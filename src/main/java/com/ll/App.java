package com.ll;

import com.ll.domain.system.controller.SystemController.SystemController;
import com.ll.domain.wiseSaying.controller.WiseSayingController;

import java.util.Scanner;

public class App {
    private final Scanner scanner;
    private final SystemController systemController;
    private final WiseSayingController wiseSayingController;

    public App(Scanner scanner) {
        this.scanner = scanner;
        this.systemController = new SystemController();
        this.wiseSayingController = new WiseSayingController(scanner);
    }

    public void run() {
        System.out.println("== 명언 앱 ==");

        while(true) {
            System.out.println("명령) ");
            String cmd = scanner.nextLine();

            String[] cmdBits = cmd.split("\\?");
            String actionName = cmdBits[0];

            switch (actionName) {
                case "종료" :
                    systemController.actionExit();
                    return;
                case "등록" :
                    wiseSayingController.actionAdd();
                    return;
                case "목록" :
                    wiseSayingController.actionList();
                    return;
                case "삭제" :
//                    wiseSayingController.actionDelete(cmd);
                    return;
            }
        }
    }
}

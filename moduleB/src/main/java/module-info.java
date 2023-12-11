module modules.practice.moduleB {
    requires modules.practice.moduleA;
    exports dev.phil.impl;
    provides dev.phil.MyInterface with dev.phil.impl.MyService;
}
# KotlinInheritance
継承

## 処理
`Box()`クラスを親クラスとして`JewelryBox()`クラスを子クラスにして処理を行う。

## コード
```
open class Box() {
    val myItem = "新しいアイテム"

    fun open() {
        println("宝箱を開いた。${myItem}を手に入れた。")
    }
}

class JewelryBox(): Box() {
    fun look() {
        println("宝箱はキラキラと輝いている")
    }
}

fun main(args: Array<String>) {
    val box = Box()
    box.open()

    val jewelrybox = JewelryBox()
    jewelrybox.look()
    jewelrybox.open()
}
```

## 出力結果  
```
宝箱を開いた。新しいアイテムを手に入れた。
宝箱はキラキラと輝いている
宝箱を開いた。新しいアイテムを手に入れた。
```

## 開発環境
| 開発ツール |  |
|:-|:-|
| OS | Windows10 |
| 仮想化ソフト | Oracle VM VirtualBox 5.2 |
| 構築ソフト | Vagrant 2.0.2 |
| 仮想化上OS | CentOS 6.9 |
| SSHクライアント | PuTTY 0.6.8 |
| FTPクライアント | Cyberduck 6.3.5 |
| エディタ | Atom 1.24.0 |
| 開発言語 | Kotlin 1.2.31 |

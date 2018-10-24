# yummyのAndroidアプリ開発リポジトリ
# ==== Emojis ====
:bug: : bug: バグ修正  
:+1: : +1: 機能改善  
:sparkles: : sparkles: 機能追加  
:zap: : zap: パフォーマンス改善  
:lipstick: : lipstick: UIやスタイルの更新  
:recycle: : recycle: リファクタリング  
:shower: : shower: 不要な機能・使われなくなった機能の削除  
:green_heart: : green_heart: テストやCIの修正・改善  
:shirt: : shirt: Lintエラーの修正やコードスタイルの修正  
:up: : up: 依存パッケージなどのアップデート  
:memo: : memo: ドキュメント更新  

## <u>GOOGLE_MAP_API_KEYの設定</u>
GOOGLE_MAP_API_KEYを設定せねばNullPointerで落ちるので、
ターミナル上で
```
launchctl setenv GOOGLE_MAP_API_KEY <API_KEY>
```
を実行する
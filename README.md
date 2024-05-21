# 設定変更箇所
## Workflow permissions
Read and write permissions

## Access
Accessible from repositories in the 'coding-sample' organization

# templateプロジェクトの使い方
1. Webからリポジトリ新規作成。templateを指定
1. pom.xmlのmaven_commonを変更（3か所）
    1. organizationの場合は、distributionManagementの宛先も修正
        https://maven.pkg.github.com/zuruorg3/comm1
1. settingsは引き継がれないので設定
    1. Actions -> General -> Read and write permissions
    1. Actions -> General -> Accessible from repositories owned by the user 'zuruzirou'
1. リポジトリ作成と同時にactionsが実行され、NGになっている。再実行

# templateプロジェクトの作り方
1. VSCからSpring Initializerで作成
1. setting.xmlを追加、pom.xmlにdistributionManagementを追加、workflow fileを追加
    1. packagesに保存
1. webから以下を設定
    1. Actions -> General -> Read and write permissions
    1. Actions -> General -> Accessible from repositories owned by the user 'zuruzirou'
1. settingsからtemplate projectに指定

# using: "composite"について
複合アクションを作成する  
https://docs.github.com/ja/actions/creating-actions/creating-a-composite-action

# repository_dispatch
https://docs.github.com/en/actions/using-workflows/events-that-trigger-workflows#repository_dispatch
PKG_READ_ETERNAL

# tag追加
git push --delete origin hoge10
git tag -d hoge10
git tag hoge10
git push origin hoge10

https://docs.github.com/ja/rest/actions/workflows?apiVersion=2022-11-28#create-a-workflow-dispatch-event
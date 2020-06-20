package firstpackage;

public class FirstClass {

	public static void main(String[] args) {
		System.out.println("First commit from local repository");
		System.out.println("Second commit from local repository");


		System.out.println("We want to form second conflict");

		System.out.println("First commit from remote repository");
		
		

	}

}

//public static void main(String[] args){ line(satir 3)
//    sout
//}
//hangi versionu gondermek istiyorsam onu commit ediyorum ve
//kodumu geri remote gondeririyorum
//Command Prompt baslica komutlar(basic commands)
//pwd => Print Working directory => hali hazirdaki adresi goster
//ls => listele her hangi bir dosyanin icerigini listele
//cd =>change directory => konum degistir
//cd .. => bir hamle geri goturuyor
//Butun adimlar:
//cd + project path => properties tum adresi aldim
//git init => ve localda projemin icine git repository olusturduk
//eclipse ten alip codlarimizi staging area ya tasiyoruz
//git add src/firstpackage/FirstClass.java
//Ne zaman durumu yoklamak isterseniz bu komutu kullanabilirsiniz
//git status
//git add . => tum file ve folder lari staging area ya ekle demektir
//git commit -m "first commit from local repo" artik staging area dan local repository e aktarmis oluyoruz
//C:\Users\sam\eclipse-workspace\git_proje_turkce>git commit -m "first commit from local repo"
//[master (root-commit) e23d4ec] first commit from local repo
//5 files changed, 49 insertions(+)
//create mode 100644 .classpath
//create mode 100644 .project
//create mode 100644 .settings/org.eclipse.jdt.core.prefs
//create mode 100644 bin/firstpackage/FirstClass.class
//create mode 100644 src/firstpackage/FirstClass.java
//git remote add origin https://github.com/HalilIbrahimHasan/git_proje_turkce.git tek seferlik remote repositoryi belirlemek icin bu command (komutu) kullaniyoruz.
//Son olarak:
//git push -u origin master => ilk ve son kez bu komutu kullaniyoruz


//Last login: Sat Jun 20 11:10:53 on ttys000
//MrBs-MacBook-Pro:~ CEO$ java- version
//-bash: java-: command not found
//MrBs-MacBook-Pro:~ CEO$ java-version
//-bash: java-version: command not found
//MrBs-MacBook-Pro:~ CEO$ java version
//Error: Could not find or load main class version
//MrBs-MacBook-Pro:~ CEO$ java version
//Error: Could not find or load main class version
//MrBs-MacBook-Pro:~ CEO$ java -version
//java version "1.8.0_251"
//Java(TM) SE Runtime Environment (build 1.8.0_251-b08)
//Java HotSpot(TM) 64-Bit Server VM (build 25.251-b08, mixed mode)
//MrBs-MacBook-Pro:~ CEO$ git -version
//unknown option: -version
//usage: git [--version] [--help] [-C <path>] [-c <name>=<value>]
//           [--exec-path[=<path>]] [--html-path] [--man-path] [--info-path]
//           [-p | --paginate | -P | --no-pager] [--no-replace-objects] [--bare]
//           [--git-dir=<path>] [--work-tree=<path>] [--namespace=<name>]
//           <command> [<args>]
//MrBs-MacBook-Pro:~ CEO$ git --version
//git version 2.27.0
//MrBs-MacBook-Pro:~ CEO$ pwd
///Users/CEO
//MrBs-MacBook-Pro:~ CEO$ cd /Users/CEO/eclipse-workspace/SelmanPractice
//MrBs-MacBook-Pro:SelmanPractice CEO$ ls
//bin	src
//MrBs-MacBook-Pro:SelmanPractice CEO$ dir
//-bash: dir: command not found
//MrBs-MacBook-Pro:SelmanPractice CEO$ ls
//bin	src
//MrBs-MacBook-Pro:SelmanPractice CEO$ cd /Users/CEO/documents
//MrBs-MacBook-Pro:documents CEO$ ls
//1.jpg
//Adobe
//Binder1.pdf
//My Documents
//My Pictures
//My Videos
//ScanSnap Organizer Library.localized
//Schedule for homebound instruction (2).pdf
//Schedule for homebound instruction draft.pdf
//Schedule for homebound instruction draft.xlsx
//Schedule k-3.pdf
//Untitled.plist
//WebEx
//Zoom
//award ceremony presentation MS.pptx
//bulletin 2020 1.pdf
//class rosters 10 29.xlsm
//k-3.pdf
//rosters december 2019.xls
//selenium libraries
//~$class rosters 10 29.xlsm
//MrBs-MacBook-Pro:documents CEO$ cd /Users/CEO/documents
//MrBs-MacBook-Pro:documents CEO$ ls
//1.jpg
//Adobe
//Binder1.pdf
//My Documents
//My Pictures
//My Videos
//ScanSnap Organizer Library.localized
//Schedule for homebound instruction (2).pdf
//Schedule for homebound instruction draft.pdf
//Schedule for homebound instruction draft.xlsx
//Schedule k-3.pdf
//Untitled.plist
//WebEx
//Zoom
//award ceremony presentation MS.pptx
//bulletin 2020 1.pdf
//class rosters 10 29.xlsm
//k-3.pdf
//rosters december 2019.xls
//selenium libraries
//~$class rosters 10 29.xlsm
//MrBs-MacBook-Pro:documents CEO$ cd /Users/CEO/eclipse-workspace/SelmanPractice
//MrBs-MacBook-Pro:SelmanPractice CEO$ ls
//bin	src
//MrBs-MacBook-Pro:SelmanPractice CEO$ cd /Users/CEO/desktop
//MrBs-MacBook-Pro:desktop CEO$ ls
//1.mp4
//6_file (1).jpg
//ADD
//AMAZON
//Aetna 2015 Employee Enrollment form 51-100 (1).pdf
//All files
//CLPR
//Contest 2020
//DCIM
//DESIGNS
//Day Time Card with time final.xls
//Dizayn
//FILES 19-20
//Graduation phota
//HTML LESSON
//Html01.html
//Java
//Ms Eljoufri.psd
//PSSA
//PSSA  2019 Rooms And Staff Assignment (Final).xlsx
//PSSA 2019
//SCREEN SHT
//Safari Bookmarks.html
//Screen Shot 2020-06-06 at 12.15.15 PM.png
//Screen Shot 2020-06-06 at 12.15.42 PM.png
//Screen Shot 2020-06-07 at 1.21.03 PM.png
//Screen Shot 2020-06-08 at 9.46.43 AM.png
//Screen Shot 2020-06-10 at 8.50.16 AM.gif
//Screen Shot 2020-06-10 at 8.50.16 AM.png
//Screen Shot 2020-06-13 at 11.43.47 AM.png
//Screen Shot 2020-06-15 at 3.29.37 PM.png
//Screen Shot 2020-06-19 at 1.36.07 PM.png
//Screen Shot 2020-06-19 at 1.36.49 PM.png
//SmartPSS.app
//Smart_Player.app
//Untitled-1.indd
//Yard signs for teachers
//backgrounds
//course
//drectory
//graduation Order # 100058980.pdf
//homebound schedule
//parent pick up.png
//rt.jpg
//scans
//selman privat
//selman.html
//sssss.MP3
//start reports gr6
//summer resources flyer
//year book 2020
//yearbook
//yearbook 2020 draft2.pdf
//zoom_0.mp4
//~$1795 adem-MMD-KB.docx
//~$O leter head.docx
//~$acher Contract 2017-18.docx
//~$ading Specialist Job Description.docx
//~$hedule of the Day Math Square.docx
//~$nus Policy Details 16-17.docx
//~$ptember Attendance Runner Ups Staff.docx
//~$rged contracts 05302017 Fixed.docx
//~$sson plan sample.docx
//~$thSquare Invitation Letter.docx
//MrBs-MacBook-Pro:desktop CEO$ cd /Users/CEO/eclipse-workspace/SelmanPractice
//MrBs-MacBook-Pro:SelmanPractice CEO$ ls
//bin	src
//MrBs-MacBook-Pro:SelmanPractice CEO$ pwd
///Users/CEO/eclipse-workspace/SelmanPractice
//MrBs-MacBook-Pro:SelmanPractice CEO$ cd ..
//MrBs-MacBook-Pro:eclipse-workspace CEO$ pwd
///Users/CEO/eclipse-workspace
//MrBs-MacBook-Pro:eclipse-workspace CEO$  cd /Users/CEO/eclipse-workspace/SelmanPractice
//MrBs-MacBook-Pro:SelmanPractice CEO$ mkdir ilkfolder
//MrBs-MacBook-Pro:SelmanPractice CEO$ /Users/CEO/eclipse-workspace/SelmanPractice
//-bash: /Users/CEO/eclipse-workspace/SelmanPractice: is a directory
//MrBs-MacBook-Pro:SelmanPractice CEO$ ls
//bin		ilkfolder	src
//MrBs-MacBook-Pro:SelmanPractice CEO$ rmdir ilkfolder
//MrBs-MacBook-Pro:SelmanPractice CEO$ type nul merhaba.txt
//-bash: type: nul: not found
//-bash: type: merhaba.txt: not found
//MrBs-MacBook-Pro:SelmanPractice CEO$ type nul hello.xlsx
//-bash: type: nul: not found
//-bash: type: hello.xlsx: not found
//MrBs-MacBook-Pro:SelmanPractice CEO$ mkdir ilkfolder
//MrBs-MacBook-Pro:SelmanPractice CEO$ cd ilkfolder
//MrBs-MacBook-Pro:ilkfolder CEO$ ls
//MrBs-MacBook-Pro:ilkfolder CEO$ mkdir ikinciFolder
//MrBs-MacBook-Pro:ilkfolder CEO$ mkdir ikinciFolder.pdf
//MrBs-MacBook-Pro:ilkfolder CEO$ ls
//ikinciFolder		ikinciFolder.pdf
//MrBs-MacBook-Pro:ilkfolder CEO$ cd ..
//MrBs-MacBook-Pro:SelmanPractice CEO$ ls
//bin		ilkfolder	src
//MrBs-MacBook-Pro:SelmanPractice CEO$ type nul hello.xlsx
//-bash: type: nul: not found
//-bash: type: hello.xlsx: not found
//MrBs-MacBook-Pro:SelmanPractice CEO$ typenul hello.xlsx
//-bash: typenul: command not found
//MrBs-MacBook-Pro:SelmanPractice CEO$ type null hello.xlsx
//-bash: type: null: not found
//-bash: type: hello.xlsx: not found
//MrBs-MacBook-Pro:SelmanPractice CEO$ cd ilkfolder
//MrBs-MacBook-Pro:ilkfolder CEO$ ls
//ikinciFolder		ikinciFolder.pdf
//MrBs-MacBook-Pro:ilkfolder CEO$ cd ..
//MrBs-MacBook-Pro:SelmanPractice CEO$ ls
//bin		ilkfolder	src
//MrBs-MacBook-Pro:SelmanPractice CEO$ type nul > yenifile.xlsx
//-bash: type: nul: not found
//MrBs-MacBook-Pro:SelmanPractice CEO$ type nul > a.xlsx
//-bash: type: nul: not found
//MrBs-MacBook-Pro:SelmanPractice CEO$ type nul > del a
//-bash: type: nul: not found
//-bash: type: a: not found
//MrBs-MacBook-Pro:SelmanPractice CEO$ del a.xlsx
//-bash: del: command not found
//MrBs-MacBook-Pro:SelmanPractice CEO$ ls
//a.xlsx		del		src
//bin		ilkfolder	yenifile.xlsx
//MrBs-MacBook-Pro:SelmanPractice CEO$ del yenifile.xlsx
//-bash: del: command not found
//MrBs-MacBook-Pro:SelmanPractice CEO$ rmdir yenifile
//rmdir: yenifile: No such file or directory
//MrBs-MacBook-Pro:SelmanPractice CEO$ ls
//a.xlsx		del		src
//bin		ilkfolder	yenifile.xlsx
//MrBs-MacBook-Pro:SelmanPractice CEO$ rmdir.yenifile.xlsx
//-bash: rmdir.yenifile.xlsx: command not found
//MrBs-MacBook-Pro:SelmanPractice CEO$ rm yenifile.xlsx
//MrBs-MacBook-Pro:SelmanPractice CEO$ rm del
//MrBs-MacBook-Pro:SelmanPractice CEO$ rm a
//rm: a: No such file or directory
//MrBs-MacBook-Pro:SelmanPractice CEO$ rm a.xlsx
//MrBs-MacBook-Pro:SelmanPractice CEO$ open /Users/CEO/eclipse-workspace/SelmanPractice
//MrBs-MacBook-Pro:SelmanPractice CEO$ open /Users/CEO/eclipse-workspace/git_proje_turkce
//MrBs-MacBook-Pro:SelmanPractice CEO$ cd /Users/CEO/eclipse-workspace/git_proje_turkce
//MrBs-MacBook-Pro:git_proje_turkce CEO$ ls
//bin	src
//MrBs-MacBook-Pro:git_proje_turkce CEO$ git config --global color.ui true
//MrBs-MacBook-Pro:git_proje_turkce CEO$ lsa
//-bash: lsa: command not found
//MrBs-MacBook-Pro:git_proje_turkce CEO$ ls
//bin	src
//MrBs-MacBook-Pro:git_proje_turkce CEO$ git config --global color.ui true
//MrBs-MacBook-Pro:git_proje_turkce CEO$ git config --global user.name
//MrBs-MacBook-Pro:git_proje_turkce CEO$ git config --global user.name "selman"
//MrBs-MacBook-Pro:git_proje_turkce CEO$ git config --global user.dmrhnslmn@gmail.com
//MrBs-MacBook-Pro:git_proje_turkce CEO$ git init
//Initialized empty Git repository in /Users/CEO/eclipse-workspace/git_proje_turkce/.git/
//MrBs-MacBook-Pro:git_proje_turkce CEO$ git addsrc/firstpackage/firstClass.java
//git: 'addsrc/firstpackage/firstClass.java' is not a git command. See 'git --help'.
//MrBs-MacBook-Pro:git_proje_turkce CEO$ git add src/firstpackage/firstClass.java
//MrBs-MacBook-Pro:git_proje_turkce CEO$ git status
//On branch master
//
//No commits yet
//
//Untracked files:
//  (use "git add <file>..." to include in what will be committed)
//	.DS_Store
//	.classpath
//	.project
//	.settings/
//	bin/
//	src/
//
//nothing added to commit but untracked files present (use "git add" to track)
//MrBs-MacBook-Pro:git_proje_turkce CEO$ git status
//On branch master
//
//No commits yet
//
//Untracked files:
//  (use "git add <file>..." to include in what will be committed)
//	.DS_Store
//	.classpath
//	.project
//	.settings/
//	bin/
//	src/
//
//nothing added to commit but untracked files present (use "git add" to track)
//MrBs-MacBook-Pro:git_proje_turkce CEO$ git add src/firstpackage/FirstClass.java
//MrBs-MacBook-Pro:git_proje_turkce CEO$ git status
//On branch master
//
//No commits yet
//
//Changes to be committed:
//  (use "git rm --cached <file>..." to unstage)
//	new file:   src/firstpackage/FirstClass.java
//
//Untracked files:
//  (use "git add <file>..." to include in what will be committed)
//	.DS_Store
//	.classpath
//	.project
//	.settings/
//	bin/
//	src/.DS_Store
//	src/firstpackage/package-info.java
//
//MrBs-MacBook-Pro:git_proje_turkce CEO$ git add .
//MrBs-MacBook-Pro:git_proje_turkce CEO$ git status
//On branch master
//
//No commits yet
//
//Changes to be committed:
//  (use "git rm --cached <file>..." to unstage)
//	new file:   .DS_Store
//	new file:   .classpath
//	new file:   .project
//	new file:   .settings/org.eclipse.jdt.core.prefs
//	new file:   bin/firstpackage/FirstClass.class
//	new file:   bin/firstpackage/package-info.class
//	new file:   src/.DS_Store
//	new file:   src/firstpackage/FirstClass.java
//	new file:   src/firstpackage/package-info.java
//
//MrBs-MacBook-Pro:git_proje_turkce CEO$ git commit -m "first commit from local report"
//[master (root-commit) 7302e56] first commit from local report
// Committer: selman <CEO@MrBs-MacBook-Pro.local>
//Your name and email address were configured automatically based
//on your username and hostname. Please check that they are accurate.
//You can suppress this message by setting them explicitly:
//
//    git config --global user.name "Your Name"
//    git config --global user.email you@example.com
//
//After doing this, you may fix the identity used for this commit with:
//
//    git commit --amend --reset-author
//
// 9 files changed, 46 insertions(+)
// create mode 100644 .DS_Store
// create mode 100644 .classpath
// create mode 100644 .project
// create mode 100644 .settings/org.eclipse.jdt.core.prefs
// create mode 100644 bin/firstpackage/FirstClass.class
// create mode 100644 bin/firstpackage/package-info.class
// create mode 100644 src/.DS_Store
// create mode 100644 src/firstpackage/FirstClass.java
// create mode 100644 src/firstpackage/package-info.java
//MrBs-MacBook-Pro:git_proje_turkce CEO$ git remote add origin https://github.com/Selmanfettahoglu/git_proje_turkce.git
//MrBs-MacBook-Pro:git_proje_turkce CEO$ git push -u origin master
//Username for 'https://github.com': selman
//Password for 'https://selman@github.com': 
//remote: Invalid username or password.
//fatal: Authentication failed for 'https://github.com/Selmanfettahoglu/git_proje_turkce.git/'
//MrBs-MacBook-Pro:git_proje_turkce CEO$ git remote add origin https://github.com/Selmanfettahoglu/git_proje_turkce.gitgit remote add origin https://github.com/Selmanfettahoglu/git_proje_turkce.git
//usage: git remote add [<options>] <name> <url>
//
//    -f, --fetch           fetch the remote branches
//    --tags                import all tags and associated objects when fetching
//                          or do not fetch any tag at all (--no-tags)
//    -t, --track <branch>  branch(es) to track
//    -m, --master <branch>
//                          master branch
//    --mirror[=(push|fetch)]
//                          set up remote as a mirror to push to or fetch from
//
//MrBs-MacBook-Pro:git_proje_turkce CEO$ git push -u origin master
//Username for 'https://github.com': selman
//Password for 'https://selman@github.com': 
//remote: Invalid username or password.
//fatal: Authentication failed for 'https://github.com/Selmanfettahoglu/git_proje_turkce.git/'
//MrBs-MacBook-Pro:git_proje_turkce CEO$ git push -u origin master
//Username for 'https://github.com': selmanfettahoglu
//Password for 'https://selmanfettahoglu@github.com': 
//remote: Invalid username or password.
//fatal: Authentication failed for 'https://github.com/Selmanfettahoglu/git_proje_turkce.git/'
//MrBs-MacBook-Pro:git_proje_turkce CEO$ git push -u origin master
//Username for 'https://github.com': Selmanfettahoglu
//Password for 'https://Selmanfettahoglu@github.com': 
//Enumerating objects: 16, done.
//Counting objects: 100% (16/16), done.
//Delta compression using up to 8 threads
//Compressing objects: 100% (14/14), done.
//Writing objects: 100% (16/16), 2.46 KiB | 1.23 MiB/s, done.
//Total 16 (delta 1), reused 0 (delta 0), pack-reused 0
//remote: Resolving deltas: 100% (1/1), done.
//To https://github.com/Selmanfettahoglu/git_proje_turkce.git
// * [new branch]      master -> master
//Branch 'master' set up to track remote branch 'master' from 'origin'.
//MrBs-MacBook-Pro:git_proje_turkce CEO$ git status
//

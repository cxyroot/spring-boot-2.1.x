require 'formula'

class Springboot < Formula
  homepage 'https://spring.io/projects/spring-boot'
  url 'https://repo.spring.io/snapshot/org/springframework/boot/spring-boot-cli/2.1.16.BUILD-SNAPSHOT/spring-boot-cli-2.1.16.BUILD-SNAPSHOT-bin.tar.gz'
  version '2.1.16.BUILD-SNAPSHOT'
  sha256 'ff63390b6713930ab27c93e42bd0d8eabf85b1cf6188c1f2b482ccd148f79be2'
  head 'https://github.com/spring-projects/spring-boot.git'

  if build.head?
    depends_on 'maven' => :build
  end

  def install
    if build.head?
      Dir.chdir('spring-boot-cli') { system 'mvn -U -DskipTests=true package' }
      root = 'spring-boot-cli/target/spring-boot-cli-*-bin/spring-*'
    else
      root = '.'
    end

    bin.install Dir["#{root}/bin/spring"]
    lib.install Dir["#{root}/lib/spring-boot-cli-*.jar"]
    bash_completion.install Dir["#{root}/shell-completion/bash/spring"]
    zsh_completion.install Dir["#{root}/shell-completion/zsh/_spring"]
  end
end

import static org.junit.Assume.assumeTrue;
  public void setUp() throws InterruptedException {
    assumeTrue(repoTwoCmdLine.isSupportedVersionControlSystem());
    HgCmdLineInterface hgCmdLineInterface = makeHgCmdLine(reposPath.resolve(REPO_TWO_DIR));
    HgCmdLineInterface hgCmdLineInterface = makeHgCmdLine(localReposPath.resolve(REPO_TWO_DIR));
        makeHgCmdLine(reposPath.resolve(REPO_WITH_SUB_DIR + "/subdir"));

  private static HgCmdLineInterface makeHgCmdLine(Path repoRootDir) {
    return new HgCmdLineInterface(
        new TestProcessExecutorFactory(),
        repoRootDir,
        new VersionControlBuckConfig(FakeBuckConfig.builder().build()).getHgCmd(),
        ImmutableMap.of());
  }
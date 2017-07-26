package jetbrains.buildServer.autotools.common;

/**
 * Created by naduxa on 11.07.2017.
 */
public final class AutotoolsBuildConstants {
  /**
   * This private constuctor is needed for an instance of a class can not be created.
   */
  private AutotoolsBuildConstants(){
  }

  /**
   * This constant is for runner type name.
   */
  public static final String TYPE = "jetbrains-autotools-build";

  /**
   *This constant is for runner plugin description name.
   */
  public static final String DESCRIPTION = "Using Autotools for configure and build project";

  /**
   * This constant is for runner plugin name for UI.
   */
  public static final String DISPLAY_NAME = "Autotools configure and build";

  /**
   * This constant is for prefix UI elements plugin names.
   */
  public static final String UI_PREFIX = "ui-" + TYPE + "-";

  /**
   * This constant is for UI element name of configure script arguments.
   */
  public static final String UI_ADDITIONAL_CONF_PARAMS = UI_PREFIX + "additional-configure-params";
  /**
   * This constant is for UI element name of make arguments.
   */
  public static final String UI_ADDITIONAL_MAKE_PARAMS = UI_PREFIX + "additional-make-params";

  /**
   * This constant is for UI element name of autoreconf need.
   */
  public static final String UI_NEED_AUTORECONF = UI_PREFIX + "need_autoreconf";

  /**
   *  This constant is for UI element name of source path.
   */
  public static final String UI_SOURCE_PATH = UI_PREFIX  + "source_path";



}

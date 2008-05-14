package info.rvin.mojo.flexmojo.compiler;

import java.io.File;
import java.util.Map;

public class Font {

	/**
	 * Enables advanced anti-aliasing for embedded fonts, which provides greater
	 * clarity for small fonts. This setting can be overriden in CSS for
	 * specific fonts.
	 */
	private boolean advancedAntiAliasing = true;

	/**
	 * -compiler.fonts.flash-type
	 */
	private String flashType;

	/**
	 * Defines ranges that can be used across multiple font-face declarations.
	 * -compiler.fonts.languages.language-range <lang> <range>
	 */
	private Map<String, String> languages;

	/**
	 * File containing cached system font licensing information produced via
	 * java -cp mxmlc.jar flex2.tools.FontSnapshot (fontpath) Will default to
	 * winFonts.ser on Windows XP and macFonts.ser on Mac OS X, so is commented
	 * out by default.
	 */
	private File localFontsSnapshot;

	/**
	 * Compiler font manager classes, in policy resolution order
	 */
	private String[] managers;

	/**
	 * The number of embedded font faces that are cached.
	 */
	private int maxCachedFonts = 20;

	/**
	 * The number of character glyph outlines to cache for each font face.
	 */
	private int maxGlyphsPerFace = 1000;

	public boolean isAdvancedAntiAliasing() {
		return advancedAntiAliasing;
	}

	public void setAdvancedAntiAliasing(boolean advancedAntiAliasing) {
		this.advancedAntiAliasing = advancedAntiAliasing;
	}

	public int getMaxCachedFonts() {
		return maxCachedFonts;
	}

	public void setMaxCachedFonts(int maxCachedFonts) {
		this.maxCachedFonts = maxCachedFonts;
	}

	public int getMaxGlyphsPerFace() {
		return maxGlyphsPerFace;
	}

	public void setMaxGlyphsPerFace(int maxGlyphsPerFace) {
		this.maxGlyphsPerFace = maxGlyphsPerFace;
	}

	public String[] getManagers() {
		return managers;
	}

	public void setManagers(String[] managers) {
		this.managers = managers;
	}

	public File getLocalFontsSnapshot() {
		return localFontsSnapshot;
	}

	public void setLocalFontsSnapshot(File localFontsSnapshot) {
		this.localFontsSnapshot = localFontsSnapshot;
	}
}
